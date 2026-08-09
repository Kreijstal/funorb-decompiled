/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends ji {
    static String[] field_F;
    private int field_z;
    static int[] field_A;
    private int field_y;
    private int[] field_D;
    private int[] field_B;
    private int field_C;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int == 0) {
                this.field_z = param2.h(-11);
                break L1;
              } else {
                if (1 == var4_int) {
                  this.field_C = param2.a((byte) -11);
                  break L1;
                } else {
                  if (var4_int != 2) {
                    break L1;
                  } else {
                    this.field_y = param2.h(-11);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                this.field_D = (int[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("dp.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        L0: {
          L1: {
            var10 = Vertigo2.field_L ? 1 : 0;
            var13 = this.field_x.a(param0, (byte) -124);
            var12 = var13;
            var3 = var12;
            if (!this.field_x.field_i) {
              break L1;
            } else {
              var4 = lf.field_y[param0];
              if (this.field_y != 0) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= we.field_M) {
                    break L1;
                  } else {
                    var6 = 0;
                    var7 = 0;
                    var8 = rh.field_O[var5];
                    var9 = this.field_y;
                    stackIn_18_0 = var9 ^ -1;

                    stackIn_18_1 = -2;

                    L3: {
                      if (stackIn_18_0 == stackIn_18_1) {
                        var6 = var8;
                        break L3;
                      } else {
                        if ((var9 ^ -1) == -3) {
                          var6 = (-4096 + var4 + var8 >> 929258945) + 2048;
                          break L3;
                        } else {
                          if (var9 != 3) {
                            break L3;
                          } else {
                            var6 = 2048 + (-var4 + var8 >> -431928639);
                            break L3;
                          }
                        }
                      }
                    }
                    var11 = 0;
                    var9 = var11;
                    L4: while (true) {
                      L5: {
                        if (var11 >= this.field_z) {
                          break L5;
                        } else {
                          if (var6 >= this.field_B[var11]) {
                            if (this.field_B[var11 + 1] > var6) {
                              if (this.field_D[var11] <= var6) {
                                break L5;
                              } else {
                                var7 = 4096;
                                break L5;
                              }
                            } else {
                              var11++;
                              continue L4;
                            }
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                      var13 = var12;
                      var13[var5] = var7;
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                var5 = 0;
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if (var6 >= this.field_z) {
                      break L7;
                    } else {
                      if (this.field_B[var6] <= var4) {
                        if (this.field_B[1 + var6] > var4) {
                          if (this.field_D[var6] <= var4) {
                            break L7;
                          } else {
                            var5 = 4096;
                            break L7;
                          }
                        } else {
                          var6++;
                          continue L6;
                        }
                      } else {
                        var6++;
                        continue L6;
                      }
                    }
                  }
                  qq.a(var13, 0, we.field_M, var5);
                  break L1;
                }
              }
            }
          }
          if (param1 > 91) {
            break L0;
          } else {
            this.field_C = 10;
            break L0;
          }
        }
        return var3;
    }

    final void a(int param0) {
        if (param0 > -98) {
            CharSequence var3 = (CharSequence) null;
            dp.a((CharSequence) null, true, false);
        }
        this.g(4096);
    }

    final static String a(CharSequence param0, boolean param1, boolean param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = rc.a(param0, 320);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) <= -2) {
                          L3: {
                            if (jq.a(var4.charAt(0), -96)) {
                              break L3;
                            } else {
                              if (jq.a(var4.charAt(-1 + var4.length()), -96)) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (!param1) {
                                    break L4;
                                  } else {
                                    dp.h(-57);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  if (param0.length() <= var6) {
                                    if (0 < var5) {
                                      stackIn_35_0 = vq.field_p;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param0.charAt(var6);
                                      if (!jq.a((char) var7, -96)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((var5 ^ -1) > -3) {
                                        break L7;
                                      } else {
                                        if (!param2) {
                                          stackIn_30_0 = mo.field_a;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_18_0 = vq.field_p;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = jn.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = jn.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = jn.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("dp.B(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_35_0;
                }
              }
            }
          }
        }
    }

    public static void h(int param0) {
        if (param0 >= -68) {
            return;
        }
        field_F = null;
        field_A = null;
    }

    public dp() {
        super(0, true);
        this.field_y = 0;
        this.field_z = 10;
        this.field_C = 2048;
    }

    private final void g(int param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        this.field_D = new int[1 + this.field_z];
        this.field_B = new int[1 + this.field_z];
        int var3 = 4096 / this.field_z;
        int var4 = this.field_C * var3 >> 281515980;
        for (var5 = 0; this.field_z > var5; var5++) {
            this.field_B[var5] = var2;
            this.field_D[var5] = var4 + var2;
            var2 = var2 + var3;
        }
        this.field_B[this.field_z] = 4096;
        this.field_D[this.field_z] = this.field_D[0] + param0;
    }

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1 = kb.field_a;
            synchronized (var1) {
              L1: {
                L2: {
                  mm.field_a = mm.field_a + 1;
                  rq.field_B = ah.field_l;
                  if ((fh.field_w ^ -1) > -1) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if ((var5 ^ -1) <= -113) {
                        fh.field_w = bd.field_f;
                        break L2;
                      } else {
                        cr.field_eb[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (bd.field_f == fh.field_w) {
                        break L2;
                      } else {
                        var2 = bq.field_D[bd.field_f];
                        bd.field_f = 127 & bd.field_f - -1;
                        if ((var2 ^ -1) <= -1) {
                          cr.field_eb[var2] = true;
                          continue L4;
                        } else {
                          cr.field_eb[var2 ^ -1] = false;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                ah.field_l = ro.field_e;
                break L1;
              }
            }
            L5: {
              if (param0 > 97) {
                break L5;
              } else {
                field_F = (String[]) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "dp.F(" + param0 + ')');
        }
    }

    final static v a(String param0, String param1, byte param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        wi stackIn_3_0 = null;
        nd stackIn_7_0 = null;
        c stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0L != param4) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackIn_3_0 = new wi(param1, param0);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param3) {
              stackIn_7_0 = new nd(param4, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param2 == -7) {
                  break L2;
                } else {
                  dp.b((byte) 42);
                  break L2;
                }
              }
              stackIn_11_0 = new c(param4, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("dp.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (v) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (v) ((Object) stackIn_7_0);
          } else {
            return (v) ((Object) stackIn_11_0);
          }
        }
    }

    static {
        field_F = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new int[8192];
    }
}
