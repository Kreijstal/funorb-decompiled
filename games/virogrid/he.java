/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends km {
    int field_ic;
    boolean field_Ib;
    static km field_Jb;
    static int field_nc;
    int field_fc;
    boolean field_Sb;
    km field_oc;
    int field_lc;
    int field_Mb;
    boolean field_Rb;
    km field_Yb;
    km field_Gb;
    km field_rc;
    km field_Kb;
    long field_gc;
    km field_bc;
    int field_ac;
    static String field_cc;
    km field_Vb;
    boolean field_dc;
    km field_Lb;
    boolean field_kc;
    static fe field_Xb;
    km field_Fb;
    km field_uc;
    km field_Ob;
    byte[] field_Pb;
    static int field_ec;
    km[] field_jc;
    static String field_Wb;
    km field_qc;
    km field_Tb;
    String[] field_Zb;
    String field_Qb;
    int field_Eb;
    km field_Nb;
    boolean field_sc;
    long field_Hb;
    static jm field_pc;
    int field_mc;
    boolean field_Ub;
    km field_hc;
    km field_tc;
    int field_vc;

    final static mg[] a(mg[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mg var3 = null;
        int var4 = 0;
        mg[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1;
            L1: while (true) {
              if (param0.length <= var2_int) {
                stackIn_5_0 = (mg[]) (param0);
                break L0;
              } else {
                var3 = param0[var2_int];
                param0[var2_int].field_x = 0;
                var3.field_r = 0;
                param0[var2_int].field_u = param0[var2_int].field_w;
                param0[var2_int].field_z = param0[var2_int].field_p;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("he.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static String a(String param0, int param1, boolean param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_35_0 = null;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        mg[] var4 = null;
        try {
          L0: {
            if (-2 != (param1 ^ -1)) {
              if ((param1 ^ -1) != -3) {
                if (param1 == 3) {
                  stackIn_9_0 = oi.a(new String[]{param0}, eg.field_p, 2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-5 != (param1 ^ -1)) {
                    if (-6 == (param1 ^ -1)) {
                      stackIn_16_0 = oi.a(new String[]{param0}, mc.field_e, 2);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (6 == param1) {
                        stackIn_20_0 = oi.a(new String[]{param0}, ch.field_h, 2);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-8 == (param1 ^ -1)) {
                          stackIn_24_0 = oi.a(new String[]{param0}, ob.field_c, 2);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param1 != 8) {
                            if (param1 == 11) {
                              stackIn_31_0 = oi.a(new String[]{param0}, ok.field_E, 2);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param1 ^ -1) == -13) {
                                stackIn_35_0 = oi.a(new String[]{param0}, bl.field_G, 2);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                L1: {
                                  if (param2) {
                                    break L1;
                                  } else {
                                    var4 = (mg[]) null;
                                    he.a((mg[]) null, -22);
                                    break L1;
                                  }
                                }
                                if (-14 == (param1 ^ -1)) {
                                  stackIn_41_0 = oi.a(new String[]{param0}, lj.field_i, 2);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackIn_27_0 = oi.a(new String[]{param0}, va.field_c, 2);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_12_0 = oi.a(new String[]{param0}, ao.field_Jb, 2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = oi.a(new String[]{param0}, tm.field_j, 2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = oi.a(new String[]{param0}, mj.field_y, 2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("he.C(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L2;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_31_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_35_0;
                          } else {
                            return stackIn_41_0;
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

    final static void i(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -532) {
          L0: {
            field_Jb = (km) null;
            wg.field_f = false;
            if (0 != sh.field_qb.g(11132)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          dh.field_n = stackIn_8_0 != 0;
          return;
        } else {
          L1: {
            wg.field_f = false;
            if (0 != sh.field_qb.g(11132)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          dh.field_n = stackIn_4_0 != 0;
          return;
        }
    }

    he(int param0) {
        super(0L, (km) null);
        this.field_Pb = new byte[param0];
    }

    final int e(byte param0) {
        if (param0 != -124) {
            return -100;
        }
        return (int)this.a((byte) 102);
    }

    public static void g(int param0) {
        if (param0 != 7) {
            return;
        }
        field_Wb = null;
        field_Xb = null;
        field_pc = null;
        field_Jb = null;
        field_cc = null;
    }

    final boolean f(byte param0) {
        int var2 = -76 % ((-42 - param0) / 40);
        return !this.a(1) ? true : false;
    }

    final static boolean h(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        var1 = hc.a(-9986);
        if (param0 < -117) {
          var3 = var1 - pc.field_b;
          if (-30001L <= (var3 ^ -1L)) {
            var5 = 3000;
            if (7 > jg.field_e) {
              if (jg.field_e < 5) {
                if (3 <= jg.field_e) {
                  var5 = 6000;
                  if (((long)var5 ^ -1L) <= (var3 ^ -1L)) {
                    return false;
                  } else {
                    pc.field_b = var1;
                    jg.field_e = jg.field_e + 1;
                    return true;
                  }
                } else {
                  if (((long)var5 ^ -1L) <= (var3 ^ -1L)) {
                    return false;
                  } else {
                    pc.field_b = var1;
                    jg.field_e = jg.field_e + 1;
                    return true;
                  }
                }
              } else {
                var5 = 9000;
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  pc.field_b = var1;
                  jg.field_e = jg.field_e + 1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                pc.field_b = var1;
                jg.field_e = jg.field_e + 1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            pc.field_b = var1;
            jg.field_e = 0;
            return true;
          }
        } else {
          field_Wb = (String) null;
          var3 = var1 - pc.field_b;
          if (-30001L <= (var3 ^ -1L)) {
            var5 = 3000;
            if (7 > jg.field_e) {
              if (jg.field_e < 5) {
                if (3 <= jg.field_e) {
                  var5 = 6000;
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    pc.field_b = var1;
                    jg.field_e = jg.field_e + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    pc.field_b = var1;
                    jg.field_e = jg.field_e + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  pc.field_b = var1;
                  jg.field_e = jg.field_e + 1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                pc.field_b = var1;
                jg.field_e = jg.field_e + 1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            pc.field_b = var1;
            jg.field_e = 0;
            return true;
          }
        }
    }

    final static mg[] b(int param0, int param1, int param2, byte param3, int param4) {
        mg[] var5;
        mg[] var6;
        var6 = new mg[9];
        var5 = var6;
        mg dupTemp$2 = eg.a(param1, (byte) 127, param4);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        mg dupTemp$3 = eg.a(param1, (byte) 45, param0);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (param3 != 89) {
          return (mg[]) null;
        } else {
          L0: {
            if (0 != param2) {
              var6[4] = eg.a(64, (byte) 24, param2);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        }
    }

    final boolean a(he param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              if (!this.field_dc) {
                if (this.field_Eb == 6) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_6_0;
              if (!param0.field_dc) {
                if (6 == param0.field_Eb) {
                  stackIn_12_0 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = 0;
                  break L2;
                }
              } else {
                stackIn_12_0 = 1;
                break L2;
              }
            }
            var4 = stackIn_12_0;
            if (param1 == -12712) {
              L3: {
                if (var3_int != 0) {
                  stackIn_18_0 = 0;
                  break L3;
                } else {
                  stackIn_18_0 = 1;
                  break L3;
                }
              }
              if (stackIn_18_0 != var4) {
                L4: {
                  if (var3_int != 0) {
                    break L4;
                  } else {
                    if (this.field_Ib == param0.field_Ib) {
                      if (!this.field_Ib) {
                        break L4;
                      } else {
                        if (this.field_fc != param0.field_fc) {
                          L5: {
                            if (this.field_fc >= param0.field_fc) {
                              stackIn_31_0 = 0;
                              break L5;
                            } else {
                              stackIn_31_0 = 1;
                              break L5;
                            }
                          }
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      stackIn_24_0 = this.field_Ib;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                if (param0.field_kc != this.field_kc) {
                  L6: {
                    if (this.field_kc) {
                      stackIn_37_0 = 0;
                      break L6;
                    } else {
                      stackIn_37_0 = 1;
                      break L6;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  if (!this.field_kc) {
                    L7: {
                      if (this.field_Hb >= param0.field_Hb) {
                        stackIn_65_0 = 0;
                        break L7;
                      } else {
                        stackIn_65_0 = 1;
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 7;
                    break L0;
                  } else {
                    L8: {
                      if (this.field_Rb) {
                        stackIn_45_0 = 1;
                        break L8;
                      } else {
                        if (this.field_lc == 2) {
                          stackIn_45_0 = 1;
                          break L8;
                        } else {
                          stackIn_45_0 = 0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var5 = stackIn_45_0;
                      if (!param0.field_Rb) {
                        if (-3 == (param0.field_lc ^ -1)) {
                          stackIn_51_0 = 1;
                          break L9;
                        } else {
                          stackIn_51_0 = 0;
                          break L9;
                        }
                      } else {
                        stackIn_51_0 = 1;
                        break L9;
                      }
                    }
                    L10: {
                      var6 = stackIn_51_0;
                      stackIn_53_0 = var6;

                      if (var5 != 0) {
                        stackIn_54_0 = stackIn_53_0;
                        stackIn_54_1 = 0;
                        break L10;
                      } else {
                        stackIn_54_0 = stackIn_53_0;
                        stackIn_54_1 = 1;
                        break L10;
                      }
                    }
                    if (stackIn_54_0 == stackIn_54_1) {
                      stackIn_57_0 = var5;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L11: {
                        if (param0.field_Hb >= this.field_Hb) {
                          stackIn_61_0 = 0;
                          break L11;
                        } else {
                          stackIn_61_0 = 1;
                          break L11;
                        }
                      }
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_20_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_14_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var3);

            stackIn_68_1 = new StringBuilder().append("he.I(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L12;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L12;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_31_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_37_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_57_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_61_0 != 0;
                    } else {
                      return stackIn_65_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_cc = "To play a multiplayer game, please either log in or create a free account.";
    }
}
