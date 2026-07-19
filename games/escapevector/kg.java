/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private vd field_c;
    static String field_a;
    private gn[] field_d;
    private gn field_e;
    static String field_b;

    final boolean g(int param0) {
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        L0: {
          var5 = EscapeVector.field_A;
          if (param0 == -9949) {
            break L0;
          } else {
            this.field_c = (vd) null;
            break L0;
          }
        }
        if (this.a(-19836)) {
          return true;
        } else {
          this.field_c.b(104);
          var6 = this.field_d;
          var2 = var6;
          var3 = 0;
          L1: while (true) {
            if (var3 >= var6.length) {
              L2: {
                if (this.field_e == null) {
                  break L2;
                } else {
                  this.field_e.c(5);
                  break L2;
                }
              }
              return this.a(param0 + -9887);
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                var4.c(5);
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_a = null;
        int var1 = 91 % ((param0 - -58) / 38);
        field_b = null;
    }

    final int a(boolean param0, int param1, int param2) {
        gn[] var4 = null;
        int var5 = 0;
        gn var6 = null;
        int var7 = 0;
        gn[] var8 = null;
        var7 = EscapeVector.field_A;
        if (null != this.field_d) {
          var8 = this.field_d;
          var4 = var8;
          if (param0) {
            var5 = 0;
            L0: while (true) {
              if (var5 >= var8.length) {
                return -1;
              } else {
                var6 = var8[var5];
                if (var6 != null) {
                  if (var6.field_j == param1) {
                    return var6.b(param2, 80);
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
          } else {
            return 3;
          }
        } else {
          return -1;
        }
    }

    final boolean c(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var7 = EscapeVector.field_A;
        if (!(null != this.field_e)) {
            return false;
        }
        if (param0 < 110) {
            return false;
        }
        int var2 = this.field_e.field_j;
        int var3 = je.a(false, var2);
        if ((var3 ^ -1) >= -1) {
            return false;
        }
        for (var4 = 0; var3 > var4; var4++) {
            var5 = this.field_e.b(var4, 74);
            if (!(nl.a((byte) 111, var5))) {
                return false;
            }
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param2 != -22357) {
            discarded$0 = this.a(-119, 57);
        }
        this.field_c.a(param0, param1, true);
    }

    final boolean a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var7 = EscapeVector.field_A;
        int var3 = je.a(param1, param0);
        if (!(0 < var3)) {
            return false;
        }
        for (var4 = 0; var4 < var3; var4++) {
            var5 = this.a(true, param0, var4);
            if (!nl.a((byte) 98, var5)) {
                return false;
            }
        }
        return true;
    }

    final boolean e(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.e(45);
        }
        return this.field_c.d((byte) -83);
    }

    final int b(int param0, int param1) {
        gn[] var3 = null;
        int var4 = 0;
        gn var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (null != this.field_d) {
          var3 = this.field_d;
          var4 = param1;
          L0: while (true) {
            if (var4 >= var3.length) {
              return -1;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (param0 == var5.field_j) {
                  return var5.field_d;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        gn var5 = null;
        int var6 = 0;
        int var7 = 0;
        gn[] var8 = null;
        var7 = EscapeVector.field_A;
        if (this.field_d == null) {
          return 0;
        } else {
          L0: {
            if (param0 == 29386) {
              break L0;
            } else {
              this.field_e = (gn) null;
              break L0;
            }
          }
          var8 = this.field_d;
          var4 = 0;
          L1: while (true) {
            if (var8.length <= var4) {
              return 0;
            } else {
              var5 = var8[var4];
              if (var5 != null) {
                if (param1 == var5.field_j) {
                  if (0 != var5.field_d) {
                    if (-2 == (var5.field_d ^ -1)) {
                      var6 = je.a(false, param1);
                      if (0 >= var6) {
                        return 0;
                      } else {
                        return var6;
                      }
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    if (var5.field_n <= 0) {
                      return 0;
                    } else {
                      return var5.field_n;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -43 / ((param0 - -62) / 32);
            var3 = 14;
            var4 = var3 - -3;
            if (param1 < var3) {
              break L1;
            } else {
              if (var4 <= param1) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(byte param0, int param1, int[] param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if ((param2.length ^ -1) != -5) {
                  break L1;
                } else {
                  if (null == this.field_e) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (this.field_e.field_j == param1) {
                      L2: {
                        this.field_e.a((byte) -15, param3, param2);
                        if (param0 == -64) {
                          break L2;
                        } else {
                          this.field_d = (gn[]) null;
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("kg.K(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int[] param3) {
        gn[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        gn var7 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length == 4) {
                  if (this.field_d != null) {
                    if (param0 == -15748) {
                      var5 = this.field_d;
                      var6 = 0;
                      L2: while (true) {
                        if (var5.length <= var6) {
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var7 = var5[var6];
                            if (var7 != null) {
                              if (param1 == var7.field_j) {
                                var7.a((byte) -15, param2, param3);
                                break L3;
                              } else {
                                break L3;
                              }
                            } else {
                              break L3;
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5_ref);
            stackOut_17_1 = new StringBuilder().append("kg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        gn[] var3 = null;
        int var4 = 0;
        gn var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (this.field_d == null) {
          return;
        } else {
          var2 = 127 % ((67 - param0) / 42);
          var3 = this.field_d;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              L1: {
                if (null != this.field_e) {
                  this.field_e.b(7108);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var5.b(7108);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean d(int param0) {
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        var5 = EscapeVector.field_A;
        if (null == this.field_d) {
          return false;
        } else {
          var6 = this.field_d;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 == 17523) {
                return false;
              } else {
                this.field_d = (gn[]) null;
                return false;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.a(false)) {
                  return true;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    kg() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        this.field_c = new vd();
        int var1 = 4;
        this.field_d = new gn[var1];
        for (var2 = 0; var1 > var2; var2++) {
            var3 = pc.field_f[var2];
            var4 = -1;
            if ((var3 ^ -1) == -2) {
                var4 = 1;
            }
            var5 = fl.field_m[var2];
            var6 = (nk.a(1, var2) ^ -1) == -3 ? 1 : 0;
            this.field_d[var2] = new gn(var2, var3, var4, var5, var6 != 0, (kg) (this));
        }
        var2 = 2;
        var3 = 1;
        var4 = 0;
        var5 = 1;
        var6 = 1;
        this.field_e = new gn(var2, var3, var4, var5, var6 != 0, (kg) (this));
    }

    final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            return false;
        }
        if (!(param2 != -1)) {
            return false;
        }
        if (!(0 != param2)) {
            return this.field_c.a(1, param0);
        }
        if (1 != param2) {
            return false;
        }
        return this.field_c.a(param0, (byte) -113);
    }

    final boolean a(int param0) {
        boolean discarded$1 = false;
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        var5 = EscapeVector.field_A;
        if (!this.field_c.d((byte) -83)) {
          return false;
        } else {
          var6 = this.field_d;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 == -19836) {
                return true;
              } else {
                discarded$1 = this.g(80);
                return true;
              }
            } else {
              var4 = var6[var3];
              if ((var4.field_d ^ -1) != -2) {
                if (!var4.field_i) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean b(int param0, int param1, int param2) {
        gn[] var4 = null;
        int var5 = 0;
        gn var6 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (this.field_d != null) {
          L0: {
            var4 = this.field_d;
            var5 = 0;
            if (param0 == 15954) {
              break L0;
            } else {
              this.field_e = (gn) null;
              break L0;
            }
          }
          L1: while (true) {
            if (var5 >= var4.length) {
              return false;
            } else {
              var6 = var4[var5];
              if (var6 != null) {
                if (param1 == var6.field_j) {
                  return var6.a(0, param2);
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
        } else {
          return false;
        }
    }

    static {
        field_a = "Orb points: ";
        field_b = "Email: ";
    }
}
