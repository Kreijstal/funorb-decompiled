/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private mg[] field_d;
    private boolean field_c;
    static e field_a;
    private int field_b;
    private String field_f;
    private boolean field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 80 % ((param0 - 73) / 32);
    }

    final static int a(byte param0, vk param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vk var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1.field_r) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.field_j == null) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 >= 6) {
                    break L1;
                  } else {
                    var6 = (vk) null;
                    kg.a((byte) 14, (vk) null);
                    break L1;
                  }
                }
                L2: {
                  var2_int = 0;
                  if (0 != param1.field_o) {
                    if (param1.field_o == 1) {
                      L3: {
                        if (!a.field_F.b((byte) 10)) {
                          break L3;
                        } else {
                          var2_int += 16;
                          break L3;
                        }
                      }
                      if (hf.field_h.b((byte) 10)) {
                        var2_int += 16;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (2 != param1.field_o) {
                        if (-4 == (param1.field_o ^ -1)) {
                          L4: {
                            if (!kc.field_b.b((byte) 10)) {
                              break L4;
                            } else {
                              var2_int += 16;
                              break L4;
                            }
                          }
                          if (!ug.field_b.b((byte) 10)) {
                            break L2;
                          } else {
                            var2_int += 16;
                            break L2;
                          }
                        } else {
                          if (4 != param1.field_o) {
                            if (5 != param1.field_o) {
                              if (param1.field_o == 6) {
                                L5: {
                                  if (hg.field_Q.b((byte) 10)) {
                                    var2_int += 16;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (fd.field_e.b((byte) 10)) {
                                  var2_int += 16;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              L6: {
                                if (!ha.field_i.b((byte) 10)) {
                                  break L6;
                                } else {
                                  var2_int += 16;
                                  break L6;
                                }
                              }
                              if (!kc.field_b.b((byte) 10)) {
                                break L2;
                              } else {
                                var2_int += 16;
                                break L2;
                              }
                            }
                          } else {
                            L7: {
                              if (ug.field_b.b((byte) 10)) {
                                var2_int += 16;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            if (ha.field_i.b((byte) 10)) {
                              var2_int += 16;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        L8: {
                          if (a.field_F.b((byte) 10)) {
                            var2_int += 16;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (!lk.field_a.b((byte) 10)) {
                          break L2;
                        } else {
                          var2_int += 16;
                          break L2;
                        }
                      }
                    }
                  } else {
                    L9: {
                      if (ol.field_h.b((byte) 10)) {
                        var2_int += 16;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (!fd.field_e.b((byte) 10)) {
                      break L2;
                    } else {
                      var2_int += 16;
                      break L2;
                    }
                  }
                }
                var3 = 0;
                var4 = 0;
                L10: while (true) {
                  if (param1.field_j.length <= var4) {
                    var2_int = var2_int + var3 * 224 / param1.field_j.length;
                    stackIn_62_0 = var2_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L11: {
                      if (param1.field_j[var4].field_c) {
                        var3++;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var4++;
                    continue L10;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var2);

            stackIn_65_1 = new StringBuilder().append("kg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L12;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_62_0;
          }
        }
    }

    final mg[] a(int param0) {
        hj[] var2;
        int var3;
        int var4;
        hj[] var5;
        var4 = HoldTheLine.field_D;
        if (param0 == 16) {
          if (this.field_d == null) {
            var5 = le.a(this.field_f, -120);
            var2 = var5;
            if (var2 == null) {
              return this.field_d;
            } else {
              this.field_d = new mg[var5.length];
              var3 = 0;
              L0: while (true) {
                if (var5.length <= var3) {
                  return this.field_d;
                } else {
                  this.field_d[var3] = new mg(var5[var3], this.field_b, this.field_c, this.field_e);
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return this.field_d;
          }
        } else {
          this.field_d = (mg[]) null;
          if (this.field_d == null) {
            var5 = le.a(this.field_f, -120);
            var2 = var5;
            if (var2 != null) {
              this.field_d = new mg[var5.length];
              var3 = 0;
              L1: while (true) {
                if (var5.length > var3) {
                  this.field_d[var3] = new mg(var5[var3], this.field_b, this.field_c, this.field_e);
                  var3++;
                  continue L1;
                } else {
                  return this.field_d;
                }
              }
            } else {
              return this.field_d;
            }
          } else {
            return this.field_d;
          }
        }
    }

    kg(String param0) {
        try {
            this.field_d = null;
            this.field_b = 4096;
            this.field_c = false;
            this.field_f = param0;
            this.field_e = false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    kg(String param0, boolean param1, boolean param2) {
        try {
            this.field_f = param0;
            this.field_d = null;
            this.field_b = 4096;
            this.field_e = param2 ? true : false;
            this.field_c = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new e(9, 0, 4, 1);
    }
}
