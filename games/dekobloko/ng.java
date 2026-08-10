/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_g;
    private bh[] field_h;
    private int field_d;
    static String field_e;
    private int field_f;
    static String field_j;
    static long field_a;
    static w field_i;
    static ck field_b;
    static String field_l;
    private bh field_k;
    private bh field_c;

    final static void a(ck[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if ((param1 ^ -1) < -1) {
                  L2: {
                    var5_int = param0[0].field_K;
                    var6 = param0[2].field_K;
                    if (param3 == -1) {
                      break L2;
                    } else {
                      field_g = (String) null;
                      break L2;
                    }
                  }
                  var7 = param0[1].field_K;
                  param0[0].c(param4, param2);
                  param0[2].c(param4 - -param1 - var6, param2);
                  hk.b(kh.field_e);
                  hk.f(var5_int + param4, param2, param4 + (param1 - var6), param2 + param0[1].field_C);
                  var8 = var5_int + param4;
                  var9 = -var6 + param4 + param1;
                  param4 = var8;
                  L3: while (true) {
                    if (param4 >= var9) {
                      hk.a(kh.field_e);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].c(param4, param2);
                      param4 = param4 + var7;
                      continue L3;
                    }
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
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ng.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -26) {
            return;
        }
        field_j = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final void a(long param0, int param1, bh param2) {
        bh var5 = null;
        try {
            if (!(null == param2.field_a)) {
                param2.b((byte) 116);
            }
            var5 = this.field_h[(int)((long)(this.field_f + param1) & param0)];
            param2.field_a = var5.field_a;
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bh a(long param0, int param1) {
        bh var4;
        bh var5;
        int var6;
        var6 = client.field_A ? 1 : 0;
        var4 = this.field_h[(int)((long)(this.field_f - 1) & param0)];
        this.field_k = var4.field_b;
        L0: while (true) {
          if (this.field_k == var4) {
            this.field_k = null;
            if (param1 >= 48) {
              return null;
            } else {
              return (bh) null;
            }
          } else {
            if ((this.field_k.field_i ^ -1L) != (param0 ^ -1L)) {
              this.field_k = this.field_k.field_b;
              continue L0;
            } else {
              var5 = this.field_k;
              this.field_k = this.field_k.field_b;
              return var5;
            }
          }
        }
    }

    final static jc a(int param0, String param1) {
        jc stackIn_3_0 = null;
        jc stackIn_6_0 = null;
        jc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        jc stackIn_26_0 = null;
        jc stackIn_40_0 = null;
        jc stackIn_44_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) >= -65) {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    var7 = (ck[]) null;
                    ng.a((ck[]) null, 38, -12, 7, -118);
                    break L1;
                  }
                }
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(var2_int + -1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L2: while (true) {
                      if (var2_int + -1 > var4) {
                        L3: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L4: {
                              if (var3 != 0) {
                                stackIn_22_0 = 0;
                                break L4;
                              } else {
                                stackIn_22_0 = 1;
                                break L4;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L3;
                          } else {
                            L5: {
                              if (var5 != 34) {
                                break L5;
                              } else {
                                if (var3 != 0) {
                                  break L5;
                                } else {
                                  stackIn_26_0 = be.field_x;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                        }
                        var4++;
                        continue L2;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_13_0 = be.field_x;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L6: while (true) {
                    if (var2_int > var4) {
                      L7: {
                        var5 = param1.charAt(var4);
                        if (46 == var5) {
                          L8: {
                            if (0 == var4) {
                              break L8;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackIn_40_0 = be.field_x;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (-1 != nm.field_Pb.indexOf(var5)) {
                            var3 = 0;
                            break L7;
                          } else {
                            stackIn_44_0 = be.field_x;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_6_0 = ga.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = hm.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var2);

            stackIn_51_1 = new StringBuilder().append("ng.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L9;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  return stackIn_44_0;
                }
              }
            }
          }
        }
    }

    final bh a(byte param0) {
        this.field_d = 0;
        if (param0 != 126) {
            this.b((byte) 112);
            return this.b((byte) 49);
        }
        return this.b((byte) 49);
    }

    final bh b(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        bh var4;
        bh var5;
        bh var8;
        bh var9;
        var3 = client.field_A ? 1 : 0;
        if ((this.field_d ^ -1) >= -1) {
          if (param0 >= 37) {
            L0: while (true) {
              if (this.field_f > this.field_d) {
                fieldTemp$2 = this.field_d;
                this.field_d = this.field_d + 1;
                var4 = this.field_h[fieldTemp$2].field_b;
                var9 = var4;
                if (var4 != this.field_h[-1 + this.field_d]) {
                  this.field_c = var9.field_b;
                  return var9;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return (bh) null;
          }
        } else {
          if (this.field_h[-1 + this.field_d] == this.field_c) {
            if (param0 >= 37) {
              L1: while (true) {
                if (this.field_f > this.field_d) {
                  fieldTemp$3 = this.field_d;
                  this.field_d = this.field_d + 1;
                  var4 = this.field_h[fieldTemp$3].field_b;
                  var5 = var4;
                  if (var4 != this.field_h[-1 + this.field_d]) {
                    this.field_c = var5.field_b;
                    return var5;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (bh) null;
            }
          } else {
            var8 = this.field_c;
            this.field_c = var8.field_b;
            return var8;
          }
        }
    }

    ng(int param0) {
        bh dupTemp$1 = null;
        int var2;
        bh var3;
        this.field_d = 0;
        this.field_f = param0;
        this.field_h = new bh[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$1 = new bh();
            var3 = dupTemp$1;
            this.field_h[var2] = dupTemp$1;
            var3.field_b = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_e = "Please check if address is correct";
        field_g = "Stage";
        field_j = "This password is part of your Player Name, and would be easy to guess";
        field_l = "Waiting for graphics";
    }
}
