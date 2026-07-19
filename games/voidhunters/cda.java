/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cda implements ntb, ofa {
    private int field_b;
    private jo[] field_a;

    public final void a(tv param0, int param1) {
        boolean discarded$23 = false;
        cda var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3 = (cda) ((Object) param0);
              discarded$23 = tja.a(var3.field_a, 1, this.field_a, false, 5547);
              if (param1 <= -19) {
                break L1;
              } else {
                this.field_a = (jo[]) null;
                break L1;
              }
            }
            L2: {
              var4 = 0;
              if (!dn.a(var3.field_a, false, 1, this.field_a, -57)) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("PartitionZone[] zones has changed. ");
                break L2;
              }
            }
            L3: {
              if (var4 != 0) {
                System.out.println("This instance of PartitionZoneList has changed");
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("cda.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (null != this.field_a) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_a.length) {
                break L0;
              } else {
                if (param1 == this.field_a[var4].field_f) {
                  this.field_a[var4].b(11964, param0);
                  this.a(-104);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param2 == -21) {
            break L2;
          } else {
            this.field_a = (jo[]) null;
            break L2;
          }
        }
    }

    final jo a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var5 = 0;
        L0: while (true) {
          if (var5 >= this.field_a.length) {
            if (param0 < 98) {
              this.a(83);
              return null;
            } else {
              return null;
            }
          } else {
            if (param2 == this.field_a[var5].field_h) {
              if (param3 == this.field_a[var5].field_b) {
                if (this.field_a[var5].field_f == param1) {
                  return this.field_a[var5];
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_a = (jo[]) ((Object) kcb.a(8, dp.field_b, param0, 1, -76, this.field_a));
              if (!param1) {
                break L1;
              } else {
                this.a(-8);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cda.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            this.field_b = -73;
        }
        cda var3 = (cda) ((Object) param1);
        if (this.field_b == var3.field_b) {
            return;
        }
        try {
            var3.field_b = this.field_b;
            var3.field_a = (jo[]) ((Object) sqb.a(var3.field_a, this.field_a, 1, dp.field_b, false));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cda.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        jo[] var4 = null;
        int var5 = 0;
        jo[] var6 = null;
        int var7 = 0;
        jo var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var3 = param0;
            if (param1 <= -109) {
              L1: {
                var4 = this.field_a;
                if (var4 == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = var4.length;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var5 = stackIn_6_0;
                var3.a(-632, var5, 8);
                if (var5 != 0) {
                  var6 = var4;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var6.length) {
                      break L2;
                    } else {
                      L4: {
                        var8 = var6[var7];
                        stackOut_10_0 = (faa) (var3);
                        stackOut_10_1 = 46;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var8 == null) {
                          stackOut_12_0 = (faa) ((Object) stackIn_12_0);
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L4;
                        } else {
                          stackOut_11_0 = (faa) ((Object) stackIn_11_0);
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L4;
                        }
                      }
                      L5: {
                        if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 == 0)) {
                          break L5;
                        } else {
                          stb.a(2, 1, var3, var8);
                          break L5;
                        }
                      }
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
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
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("cda.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 > -11) {
            return;
        }
        try {
            kma.a(param1, false, -17833, param2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cda.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        cda var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = 107 / ((22 - param0) / 59);
            var3 = (cda) ((Object) param1);
            stackOut_0_0 = dn.a(var3.field_a, false, 1, this.field_a, 3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("cda.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final jo a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        jo var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == this.field_a) {
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_a.length) {
                break L0;
              } else {
                if (this.field_a[var5].field_h == param1) {
                  if (param2 == this.field_a[var5].field_b) {
                    if (param3 == this.field_a[var5].field_f) {
                      return this.field_a[var5];
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          var7 = new jo(param1, param2, param3);
          if (param0 > 118) {
            break L2;
          } else {
            this.field_b = -59;
            break L2;
          }
        }
        this.field_a = (jo[]) ((Object) qlb.a(this.field_a, var7, dp.field_b, true, true, 1));
        this.a(125);
        return var7;
    }

    final void a(int param0) {
        int fieldTemp$0 = ggb.field_a;
        ggb.field_a = ggb.field_a + 1;
        this.field_b = fieldTemp$0;
        int var2 = -124 % ((-66 - param0) / 32);
    }

    cda() {
        this.field_b = 0;
        this.a(-33);
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 == -6775) {
            break L0;
          } else {
            this.field_a = (jo[]) null;
            break L0;
          }
        }
        var5 = -1;
        var6 = 0;
        L1: while (true) {
          L2: {
            if (this.field_a.length <= var6) {
              break L2;
            } else {
              if (param3 == this.field_a[var6].field_h) {
                if (this.field_a[var6].field_b == param2) {
                  if (this.field_a[var6].field_f == param0) {
                    var5 = var6;
                    break L2;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            }
          }
          if (var5 == -1) {
            return false;
          } else {
            L3: {
              this.field_a = (jo[]) ((Object) dt.a(dp.field_b, var5, 15667, this.field_a));
              this.a(-100);
              if (this.field_a == null) {
                break L3;
              } else {
                if (-1 == (this.field_a.length ^ -1)) {
                  break L3;
                } else {
                  return false;
                }
              }
            }
            return true;
          }
        }
    }

    static {
    }
}
