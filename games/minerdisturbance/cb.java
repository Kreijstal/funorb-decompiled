/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cb extends ok implements wg {
    private ui field_g;
    static long[] field_f;
    static long[][] field_h;
    static ea field_e;

    abstract ag a(String param0, int param1);

    public static void d(boolean param0) {
        try {
            field_f = null;
            field_h = (long[][]) null;
            field_e = null;
            if (param0) {
                field_f = (long[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "cb.N(" + param0 + ')');
        }
    }

    public final void a(ui param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -7802) {
                break L1;
              } else {
                field_f = (long[]) null;
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
            stackOut_3_1 = new StringBuilder().append("cb.J(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public final void b(ui param0, int param1) {
        ag discarded$3 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.c(-11);
              if (param1 == 60) {
                break L1;
              } else {
                discarded$3 = this.b(false);
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
            stackOut_3_1 = new StringBuilder().append("cb.L(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    cb(ui param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cb.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void c(boolean param0) {
        String discarded$4 = null;
        int fieldTemp$5 = 0;
        String discarded$6 = null;
        int fieldTemp$7 = 0;
        RuntimeException var1 = null;
        ld var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        pe var5_ref = null;
        pe var6 = null;
        String var6_ref = null;
        String var7 = null;
        pe var7_ref = null;
        int var8 = 0;
        int stackIn_12_0 = 0;
        om stackIn_45_0 = null;
        long stackIn_45_1 = 0L;
        om stackIn_47_0 = null;
        long stackIn_47_1 = 0L;
        om stackIn_48_0 = null;
        long stackIn_48_1 = 0L;
        int stackIn_48_2 = 0;
        pe stackIn_56_0 = null;
        pe stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        pe stackIn_63_0 = null;
        pe stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        om stackOut_44_0 = null;
        long stackOut_44_1 = 0L;
        om stackOut_47_0 = null;
        long stackOut_47_1 = 0L;
        int stackOut_47_2 = 0;
        om stackOut_45_0 = null;
        long stackOut_45_1 = 0L;
        int stackOut_45_2 = 0;
        pe stackOut_55_0 = null;
        pe stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        pe stackOut_61_0 = null;
        pe stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_ref = kj.field_a;
            var2 = var1_ref.d((byte) -54);
            if (var2 != 0) {
              if ((var2 ^ -1) != -2) {
                if (2 != var2) {
                  if (3 == var2) {
                    L1: {
                      if ((ha.field_g ^ -1) != -3) {
                        break L1;
                      } else {
                        ha.field_g = 1;
                        break L1;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -5) {
                      L2: {
                        di.a((Throwable) null, 1, "F1: " + hj.a((byte) 104));
                        si.a(-26);
                        if (!param0) {
                          break L2;
                        } else {
                          discarded$4 = cb.a((byte) 60);
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ha.field_g = 1;
                      var3 = var1_ref.a(false);
                      bd.field_j = var3.intern();
                      var4 = var1_ref.d((byte) -54);
                      g.a(var4, 2);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    if (1 == ha.field_g) {
                      ha.field_g = 2;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L4: {
                  if (ae.field_a == null) {
                    ae.field_a = new om(128);
                    r.field_c = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var3 = var1_ref.a(false);
                  if (!var3.equals("")) {
                    break L5;
                  } else {
                    var3 = null;
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1_ref.a(false);
                  var5 = var1_ref.a(false);
                  var6 = nd.a(1, var4_ref_String);
                  if (var6 != null) {
                    break L6;
                  } else {
                    var6 = nd.a(1, var5);
                    if (null != var6) {
                      ae.field_a.a((long)cl.a(-95, (CharSequence) ((Object) var4_ref_String)).hashCode(), true, var6);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var6 == null) {
                    L8: {
                      var6 = new pe();
                      stackOut_44_0 = ae.field_a;
                      stackOut_44_1 = (long)cl.a(-95, (CharSequence) ((Object) var4_ref_String)).hashCode();
                      stackIn_47_0 = stackOut_44_0;
                      stackIn_47_1 = stackOut_44_1;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      if (param0) {
                        stackOut_47_0 = (om) ((Object) stackIn_47_0);
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        break L8;
                      } else {
                        stackOut_45_0 = (om) ((Object) stackIn_45_0);
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = 1;
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_48_2 = stackOut_45_2;
                        break L8;
                      }
                    }
                    ((om) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2 != 0, var6);
                    fieldTemp$5 = r.field_c;
                    r.field_c = r.field_c + 1;
                    var6.field_tb = fieldTemp$5;
                    pe.field_qb.a((byte) 122, var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var6.field_ob = var4_ref_String;
                var6.field_nb = var3;
                var6.b(34);
                var7_ref = (pe) ((Object) pe.field_qb.b(82));
                L10: while (true) {
                  L11: {
                    L12: {
                      L13: {
                        L14: {
                          if (var7_ref == null) {
                            break L14;
                          } else {
                            stackOut_55_0 = (pe) (var6);
                            stackOut_55_1 = (pe) (var7_ref);
                            stackOut_55_2 = -73;
                            stackIn_63_0 = stackOut_55_0;
                            stackIn_63_1 = stackOut_55_1;
                            stackIn_63_2 = stackOut_55_2;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            stackIn_56_2 = stackOut_55_2;
                            if (var8 != 0) {
                              break L13;
                            } else {
                              if (!vl.a(stackIn_56_0, stackIn_56_1, stackIn_56_2)) {
                                break L14;
                              } else {
                                var7_ref = (pe) ((Object) pe.field_qb.b((byte) 56));
                                if (var8 == 0) {
                                  continue L10;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        if (var7_ref == null) {
                          break L12;
                        } else {
                          stackOut_61_0 = (pe) (var6);
                          stackOut_61_1 = (pe) (var7_ref);
                          stackOut_61_2 = -117;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          stackIn_63_2 = stackOut_61_2;
                          break L13;
                        }
                      }
                      oj.a(stackIn_63_0, stackIn_63_1, (byte) stackIn_63_2);
                      if (var8 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                    pe.field_qb.a((byte) 114, var6);
                    break L11;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L15: {
                if (tc.field_o == null) {
                  tc.field_o = new om(128);
                  wd.field_c = 0;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (var1_ref.d((byte) -54) != 1) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L16;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L16;
                }
              }
              L17: {
                var3_int = stackIn_12_0;
                var4_ref_String = var1_ref.a(param0);
                if (var3_int == 0) {
                  break L17;
                } else {
                  discarded$6 = var1_ref.a(false);
                  break L17;
                }
              }
              L18: {
                var5_ref = an.a((byte) -97, var4_ref_String);
                var6_ref = var1_ref.a(false);
                var7 = cl.a(-95, (CharSequence) ((Object) var4_ref_String));
                if (null != var7) {
                  break L18;
                } else {
                  var7 = var4_ref_String;
                  break L18;
                }
              }
              L19: {
                if (var5_ref == null) {
                  var5_ref = an.a((byte) 126, var6_ref);
                  if (null == var5_ref) {
                    break L19;
                  } else {
                    tc.field_o.a((long)var7.hashCode(), true, var5_ref);
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
              L20: {
                if (null != var5_ref) {
                  break L20;
                } else {
                  var5_ref = new pe();
                  tc.field_o.a((long)var7.hashCode(), true, var5_ref);
                  fieldTemp$7 = wd.field_c;
                  wd.field_c = wd.field_c + 1;
                  var5_ref.field_tb = fieldTemp$7;
                  om.field_c.a((byte) -93, var5_ref);
                  break L20;
                }
              }
              var5_ref.field_ob = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "cb.H(" + param0 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    abstract String a(byte param0, String param1);

    public final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_h = (long[][]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_g.field_s) {
                  break L3;
                } else {
                  if (this.field_g.field_s.length() != 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "cb.M(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final ag b(boolean param0) {
        String discarded$2 = null;
        RuntimeException var2 = null;
        ag stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                discarded$2 = this.a((byte) -98, (String) null);
                break L1;
              }
            }
            stackOut_3_0 = this.a(this.field_g.field_s, 5);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "cb.I(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final String e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            var2_int = -106 % ((-44 - param0) / 38);
            stackOut_0_0 = this.a((byte) -78, this.field_g.field_s);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "cb.F(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -18) {
                break L1;
              } else {
                field_h = (long[][]) null;
                break L1;
              }
            }
            if (ti.field_J != null) {
              stackOut_6_0 = ti.field_J;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = "";
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "cb.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            long var2 = 0L;
            long var4 = 0L;
            long var6 = 0L;
            long var8 = 0L;
            long var10 = 0L;
            long var12 = 0L;
            int var14 = 0;
            long stackIn_6_0 = 0L;
            long stackOut_5_0 = 0L;
            long stackOut_3_0 = 0L;
            field_f = new long[11];
            field_h = new long[8][256];
            var0 = 0;
            L0: while (true) {
              if (-257 >= (var0 ^ -1)) {
                field_f[0] = 0L;
                var0 = 1;
                L1: while (true) {
                  if (-11 > (var0 ^ -1)) {
                    break $cfr$clinit;
                  } else {
                    var1 = -8 + 8 * var0;
                    field_f[var0] = te.a(te.a(bf.a(field_h[6][6 + var1], 65280L), te.a(te.a(bf.a(field_h[4][4 + var1], 4278190080L), te.a(te.a(te.a(bf.a(-72057594037927936L, field_h[0][var1]), bf.a(field_h[1][var1 - -1], 71776119061217280L)), bf.a(field_h[2][2 + var1], 280375465082880L)), bf.a(field_h[3][var1 + 3], 1095216660480L))), bf.a(16711680L, field_h[5][5 + var1]))), bf.a(255L, field_h[7][7 + var1]));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if ((1 & var0 ^ -1) == -1) {
                    stackOut_5_0 = (long)(var1 >>> 1428021992);
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (long)(255 & var1);
                    stackIn_6_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_6_0;
                  var4 = var2 << 1212070145;
                  if (-257L < (var4 ^ -1L)) {
                    break L3;
                  } else {
                    var4 = var4 ^ 285L;
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 860973953;
                  if (-257L >= (var6 ^ -1L)) {
                    var6 = var6 ^ 285L;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << -975374399;
                  if (var10 < 256L) {
                    break L5;
                  } else {
                    var10 = var10 ^ 285L;
                    break L5;
                  }
                }
                var12 = var10 ^ var2;
                field_h[0][var0] = pa.a(var12, pa.a(pa.a(pa.a(pa.a(var2 << -1538824736, pa.a(pa.a(var2 << -1501363792, var2 << 1758605944), var6 << 1281394216)), var10 << -1722877672), var8 << 26368016), var4 << 1880436232));
                var14 = 1;
                L6: while (true) {
                  if (8 <= var14) {
                    var0++;
                    continue L0;
                  } else {
                    field_h[var14][var0] = pa.a(field_h[var14 + -1][var0] >>> -1592291768, field_h[var14 - 1][var0] << -1189832072);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
