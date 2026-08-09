/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dca extends ana {
    static int field_v;
    private boolean field_z;
    private boolean field_x;
    private la field_w;
    static java.awt.Canvas field_y;

    dca(gj param0, la param1, boolean param2) {
        super(param0, param1);
        this.field_z = false;
        try {
            this.field_x = param2 ? true : false;
            this.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "dca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_y = null;
        if (param0 != -87) {
            lu var2 = (lu) null;
            dca.a((byte) 46, (lu) null);
        }
    }

    private final void f(byte param0) {
        if (param0 != 68) {
            this.field_z = false;
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$1 = 0;
        int var2_int;
        te var2;
        if (!this.field_x) {
          if (this.field_m.a((byte) -106)) {
            return false;
          } else {
            fieldTemp$1 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if ((fieldTemp$1 ^ -1) <= -1) {
              L0: {
                if (this.field_z) {
                  break L0;
                } else {
                  this.field_w.field_l.a(-27449, this.field_q).b(-1, 7);
                  var2 = new te(this.field_q, this.field_w.field_q, this.field_w.field_t);
                  ((kj) ((Object) var2)).a(0);
                  this.field_z = true;
                  break L0;
                }
              }
              return false;
            } else {
              var2_int = -97 % ((71 - param0) / 47);
              this.f((byte) 68);
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static pp a(byte param0, lu param1) {
        pp stackIn_4_0 = null;
        pp stackIn_8_0 = null;
        pp stackIn_11_0 = null;
        pp stackIn_14_0 = null;
        pp stackIn_19_0 = null;
        pp stackIn_23_0 = null;
        Object stackIn_31_0 = null;
        pp stackIn_33_0 = null;
        pp stackIn_35_0 = null;
        pp stackIn_37_0 = null;
        pp stackIn_39_0 = null;
        pp stackIn_41_0 = null;
        pp stackIn_43_0 = null;
        pp stackIn_45_0 = null;
        pp stackIn_47_0 = null;
        pp stackIn_49_0 = null;
        pp stackIn_51_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 102) {
                break L1;
              } else {
                field_v = 111;
                break L1;
              }
            }
            var2_int = param1.b(16711935);
            if (1 != var2_int) {
              if ((var2_int ^ -1) == -3) {
                stackIn_51_0 = vha.b(param1, -119);
                decompiledRegionSelector0 = 16;
                break L0;
              } else {
                if ((var2_int ^ -1) != -4) {
                  if (4 != var2_int) {
                    if (5 != var2_int) {
                      if (6 == var2_int) {
                        stackIn_49_0 = rk.a(1, param1);
                        decompiledRegionSelector0 = 15;
                        break L0;
                      } else {
                        if ((var2_int ^ -1) == -8) {
                          stackIn_47_0 = ur.a(param1, (byte) 120);
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if ((var2_int ^ -1) != -9) {
                            if (-10 == (var2_int ^ -1)) {
                              stackIn_45_0 = ie.a(param1, false);
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              if (10 != var2_int) {
                                if ((var2_int ^ -1) == -12) {
                                  stackIn_43_0 = bea.a(-1547040176, param1);
                                  decompiledRegionSelector0 = 12;
                                  break L0;
                                } else {
                                  if (12 == var2_int) {
                                    stackIn_41_0 = iba.b((byte) -121, param1);
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    if (var2_int == 13) {
                                      stackIn_39_0 = wb.a(param1, -45);
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    } else {
                                      if (14 == var2_int) {
                                        stackIn_37_0 = oda.a(-127, param1);
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      } else {
                                        if (-16 == (var2_int ^ -1)) {
                                          stackIn_35_0 = df.b(param1, 85);
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          if (16 == var2_int) {
                                            stackIn_33_0 = ta.a(59, param1);
                                            decompiledRegionSelector0 = 7;
                                            break L0;
                                          } else {
                                            stackIn_31_0 = null;
                                            decompiledRegionSelector0 = 6;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_23_0 = eo.a(param1, -4479);
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          } else {
                            stackIn_19_0 = aba.a(param1, param0 + -93);
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_14_0 = gs.a(true, param1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = im.a(-22833, param1);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = hba.a(-30, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = n.a(param1, -127);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("dca.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L2;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return (pp) ((Object) stackIn_31_0);
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_33_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_35_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_37_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_39_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_41_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_43_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_45_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_47_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_49_0;
                                      } else {
                                        return stackIn_51_0;
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
                  }
                }
              }
            }
          }
        }
    }

    final static void d(int param0) {
        int var1;
        var1 = -78 % ((param0 - 6) / 53);
        if (!ng.a((byte) -24)) {
          fma.a(1, true, wi.field_o);
          fma.a(2, true, gm.field_j);
          fma.a(4, true, fm.field_g);
          return;
        } else {
          return;
        }
    }

    static {
    }
}
