/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cda implements ntb, ofa {
    private int field_b;
    private jo[] field_a;

    public final void a(tv param0, int param1) {
        cda var3 = null;
        int var4 = 0;
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
              var3 = (cda) ((Object) param0);
              tja.a(var3.field_a, 1, this.field_a, false, 5547);
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("cda.F(");

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

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        L0: {
          var5 = VoidHunters.field_G;
          if (null != this.field_a) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_a.length) {
                break L0;
              } else {
                if ((param1 ^ -1) == (this.field_a[var4].field_f ^ -1)) {
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
        int var5;
        int var6;
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
        try {
            this.field_a = (jo[]) ((Object) kcb.a(8, dp.field_b, param0, 1, -76, this.field_a));
            if (param1) {
                this.a(-8);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cda.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        jo[] var4 = null;
        int var5 = 0;
        jo[] var6 = null;
        int var7 = 0;
        jo var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var3 = param0;
            if (param1 <= -109) {
              L1: {
                var4 = this.field_a;
                if (var4 == null) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = var4.length;
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
                        stackIn_12_0 = (faa) (var3);

                        stackIn_12_1 = 46;

                        if (var8 == null) {
                          stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 0;
                          break L4;
                        } else {
                          stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 1;
                          break L4;
                        }
                      }
                      L5: {
                        if (!vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
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
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("cda.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = 107 / ((22 - param0) / 59);
            var3 = (cda) ((Object) param1);
            stackIn_1_0 = dn.a(var3.field_a, false, 1, this.field_a, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("cda.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final jo a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        jo var7;
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
        int var5;
        int var6;
        int var7;
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
              if ((param3 ^ -1) == (this.field_a[var6].field_h ^ -1)) {
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
