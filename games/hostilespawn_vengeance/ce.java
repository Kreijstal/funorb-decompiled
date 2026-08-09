/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ce {
    static u[] field_f;
    static int field_e;
    pm[] field_d;
    static int[] field_b;
    static String field_g;
    static bd field_a;
    static int field_c;

    final int b(int param0, int param1) {
        int var4 = 0;
        pm var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        pm[] var7 = this.field_d;
        pm[] var3 = var7;
        for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_b.length > param0) {
                return var5.field_b[param0];
            }
            param0 = param0 - (var5.field_b.length + -1);
        }
        return 0;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (this.field_d == null) {
                break L1;
              } else {
                if (0 < this.field_d.length) {
                  stackIn_7_0 = this.field_d[this.field_d.length - 1].field_f - this.field_d[0].field_i;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 24;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        pm var4 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        for (var3 = param1; this.field_d.length > var3; var3++) {
            var4 = this.field_d[var3];
            if (var4.field_b.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_b.length + -1);
        }
        return this.field_d.length;
    }

    final static void a(ln param0, boolean param1) {
        int var2_int = 0;
        ln var3 = null;
        int var4 = 0;
        ln stackIn_19_0 = null;
        ln stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_s) {
              L1: {
                L2: {
                  if (-1 != (param0.field_i ^ -1)) {
                    break L2;
                  } else {
                    if (param0.field_e != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= qb.field_i) {
                    break L1;
                  } else {
                    L4: {
                      var3 = rj.field_J[var2_int];
                      if (2 != var3.field_f) {
                        break L4;
                      } else {
                        if (param0.field_i != var3.field_i) {
                          break L4;
                        } else {
                          if (param0.field_e == var3.field_e) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param0.field_o) {
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                stackIn_19_0 = (ln) (param0);

                if (param1) {
                  stackIn_20_0 = (ln) ((Object) stackIn_19_0);
                  stackIn_20_1 = 0;
                  break L6;
                } else {
                  stackIn_20_0 = (ln) ((Object) stackIn_19_0);
                  stackIn_20_1 = 1;
                  break L6;
                }
              }
              L7: {
                ed.a(stackIn_20_0, stackIn_20_1 != 0);
                if (param1) {
                  break L7;
                } else {
                  field_f = (u[]) null;
                  break L7;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ce.F(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        pm var6;
        int var7;
        int var8;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (null == this.field_d) {
            break L0;
          } else {
            if (this.field_d.length == 0) {
              break L0;
            } else {
              if (this.field_d[0].field_i > param1) {
                break L0;
              } else {
                if (param1 > this.field_d[-1 + this.field_d.length].field_f) {
                  return -1;
                } else {
                  if ((this.field_d.length ^ -1) != -2) {
                    var4 = 0;
                    if (param0 > 82) {
                      var5 = 0;
                      L1: while (true) {
                        if (this.field_d.length <= var5) {
                          return -1;
                        } else {
                          L2: {
                            var6 = this.field_d[var5];
                            if (var6.field_i > param1) {
                              break L2;
                            } else {
                              if (var6.field_f >= param1) {
                                var7 = var6.a(param2, (byte) -125);
                                if (-1 != var7) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (var6.field_b.length + -1);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -76;
                    }
                  } else {
                    return this.field_d[0].a(param2, (byte) -111);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 >= 1) {
              var5_int = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if (0 >= var5_int) {
                    stackIn_22_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_20_0 = (param1 + -param0 << 1671528488) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    var9 = param3.charAt(var8);
                    if (-61 == (var9 ^ -1)) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        if (var6 == 0) {
                          if (var9 == 32) {
                            var5_int++;
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -59;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("ce.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0;
          } else {
            return stackIn_22_0;
          }
        }
    }

    final int a(int param0) {
        int var2;
        pm[] var3;
        int var4;
        pm var5;
        int var7;
        int var6;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var2 = -1;
        if (param0 == 3915) {
          L0: {
            if (null != this.field_d) {
              var3 = this.field_d;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a((byte) 127);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
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
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -107;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 != 6937) {
            ce.b(85);
        }
        field_f = null;
    }

    static {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = new int[]{100, 235, 340, 550};
    }
}
