/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends vc {
    private int field_j;
    private long[] field_l;
    private long field_k;
    static String field_i;
    private int field_m;
    private long field_n;
    private long field_h;

    final static void a(int param0, fa param1, fa param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 106) {
                break L1;
              } else {
                jd.a(-74, (fa) null, (fa) null);
                break L1;
              }
            }
            sj.field_f = param1;
            dm.field_d = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final long a(int param0) {
        RuntimeException var2 = null;
        long stackIn_2_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_9_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_6_0 = 0L;
        long stackOut_8_0 = 0L;
        long stackOut_1_0 = 0L;
        try {
          L0: {
            ((jd) this).field_n = ((jd) this).field_n + this.a((byte) -82);
            if (param0 > 39) {
              if (((jd) this).field_n < ((jd) this).field_k) {
                stackOut_6_0 = (-((jd) this).field_n + ((jd) this).field_k) / 1000000L;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = 0L;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 8L;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "jd.A(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0, long param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == 0) {
              if (((jd) this).field_n < ((jd) this).field_k) {
                ((jd) this).field_h = ((jd) this).field_h + (((jd) this).field_k - ((jd) this).field_n);
                ((jd) this).field_n = ((jd) this).field_n + (((jd) this).field_k + -((jd) this).field_n);
                ((jd) this).field_k = ((jd) this).field_k + param1;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var4_int = 0;
                L1: while (true) {
                  ((jd) this).field_k = ((jd) this).field_k + param1;
                  var4_int++;
                  stackOut_6_0 = 10;
                  stackIn_7_0 = stackOut_6_0;
                  L2: while (true) {
                    L3: {
                      if (stackIn_7_0 <= var4_int) {
                        break L3;
                      } else {
                        if (~((jd) this).field_n < ~((jd) this).field_k) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_9_0 = (((jd) this).field_k < ((jd) this).field_n ? -1 : (((jd) this).field_k == ((jd) this).field_n ? 0 : 1));
                    stackIn_7_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var5 != 0) {
                      continue L2;
                    } else {
                      L4: {
                        if (stackIn_10_0 >= 0) {
                          break L4;
                        } else {
                          ((jd) this).field_k = ((jd) this).field_n;
                          break L4;
                        }
                      }
                      stackOut_13_0 = var4_int;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "jd.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        cc var2 = null;
        uf var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var2 = (cc) (Object) qb.field_a.d(9272);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    ia.a(param1, var2, -118);
                    var2 = (cc) (Object) qb.field_a.e((byte) -119);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param0) {
                  break L2;
                } else {
                  jd.d(116);
                  break L2;
                }
              }
              var2_ref = qc.field_a.d(9272);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var2_ref) {
                      break L6;
                    } else {
                      da.a(0, param1);
                      var2_ref = qc.field_a.e((byte) -119);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "jd.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final long a(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_long = System.nanoTime();
              var4 = -((jd) this).field_h + var2_long;
              ((jd) this).field_h = var2_long;
              if (var4 <= -5000000000L) {
                break L1;
              } else {
                if (5000000000L > var4) {
                  L2: {
                    ((jd) this).field_l[((jd) this).field_j] = var4;
                    if (((jd) this).field_m < 1) {
                      ((jd) this).field_m = ((jd) this).field_m + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((jd) this).field_j = (1 + ((jd) this).field_j) % 10;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = 0L;
            var8 = 1;
            L3: while (true) {
              L4: {
                L5: {
                  if (((jd) this).field_m < var8) {
                    break L5;
                  } else {
                    var6 = var6 + ((jd) this).field_l[(10 + (((jd) this).field_j - var8)) % 10];
                    var8++;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (param0 < -29) {
                  break L4;
                } else {
                  jd.a(69, (fa) null, (fa) null);
                  break L4;
                }
              }
              stackOut_21_0 = var6 / (long)((jd) this).field_m;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "jd.F(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -21) {
                break L1;
              } else {
                jd.a(false, -74);
                break L1;
              }
            }
            L2: {
              uf.field_f.b(param3, param0);
              if (!param2) {
                break L2;
              } else {
                L3: {
                  var4_int = 2 * (el.field_e % uf.field_f.field_r);
                  if (var4_int < uf.field_f.field_r) {
                    break L3;
                  } else {
                    var4_int = uf.field_f.field_r - var4_int + uf.field_f.field_r;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (var4_int >= 10) {
                      break L5;
                    } else {
                      var4_int = 10;
                      if (Terraphoenix.field_V == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var4_int > -40 + uf.field_f.field_r) {
                    var4_int = -40 + uf.field_f.field_r;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4_int, 0, 80);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "jd.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) {
        try {
            ((jd) this).field_h = (long)param0;
            if (~((jd) this).field_k < ~((jd) this).field_n) {
                ((jd) this).field_n = ((jd) this).field_n + (((jd) this).field_k + -((jd) this).field_n);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jd.G(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "jd.I(" + param0 + ')');
        }
    }

    final static void a(dc param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        byte stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 3) {
                    break L3;
                  } else {
                    je.field_a[var2_int] = 0;
                    var2_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= am.field_J) {
                      break L6;
                    } else {
                      stackOut_9_0 = ra.field_i[var2_int].field_l;
                      stackOut_9_1 = param0.field_l;
                      stackIn_19_0 = stackOut_9_0;
                      stackIn_19_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        L7: {
                          if (stackIn_12_0 == stackIn_12_1) {
                            int dupTemp$4 = ra.field_i[var2_int].a(2);
                            je.field_a[dupTemp$4] = je.field_a[dupTemp$4] + 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = param1;
                  stackOut_18_1 = -93;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L5;
                }
                L8: {
                  if (stackIn_19_0 <= stackIn_19_1) {
                    break L8;
                  } else {
                    field_i = null;
                    break L8;
                  }
                }
                int dupTemp$5 = param0.a(2);
                je.field_a[dupTemp$5] = je.field_a[dupTemp$5] + 1;
                var2_int = 0;
                var3 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (~var3 <= ~am.field_J) {
                        break L11;
                      } else {
                        stackOut_24_0 = ~param0.field_l;
                        stackIn_36_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var5 != 0) {
                          break L10;
                        } else {
                          L12: {
                            L13: {
                              if (stackIn_25_0 != ~ra.field_i[var3].field_l) {
                                break L13;
                              } else {
                                var4 = ra.field_i[var3].a(2);
                                if (~bl.field_f > ~je.field_a[var4]) {
                                  je.field_a[var4] = je.field_a[var4] - 1;
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                            int incrementValue$6 = var2_int;
                            var2_int++;
                            ra.field_i[incrementValue$6] = ra.field_i[var3];
                            break L12;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_35_0 = var2_int;
                    stackIn_36_0 = stackOut_35_0;
                    break L10;
                  }
                  am.field_J = stackIn_36_0;
                  int fieldTemp$7 = am.field_J;
                  am.field_J = am.field_J + 1;
                  ra.field_i[fieldTemp$7] = param0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("jd.H(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L14;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ')');
        }
    }

    jd() {
        ((jd) this).field_k = 0L;
        ((jd) this).field_l = new long[10];
        ((jd) this).field_j = 0;
        ((jd) this).field_n = 0L;
        ((jd) this).field_h = 0L;
        ((jd) this).field_m = 1;
        try {
            ((jd) this).field_n = System.nanoTime();
            ((jd) this).field_k = System.nanoTime();
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jd.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
