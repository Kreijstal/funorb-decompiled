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
        try {
            if (param0 < 106) {
                jd.a(-74, (fa) null, (fa) null);
            }
            sj.field_f = param1;
            dm.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "jd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) {
        this.field_n = this.field_n + this.a((byte) -82);
        if (param0 <= 39) {
            return 8L;
        }
        if (!(this.field_n >= this.field_k)) {
            return (-this.field_n + this.field_k) / 1000000L;
        }
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        var5 = Terraphoenix.field_V;
        if (param0 == 0) {
          if (this.field_n >= this.field_k) {
            var4 = 0;
            L0: while (true) {
              this.field_k = this.field_k + param1;
              var4++;
              stackOut_5_0 = 10;
              stackIn_6_0 = stackOut_5_0;
              L1: while (true) {
                L2: {
                  if (stackIn_6_0 <= var4) {
                    break L2;
                  } else {
                    if ((this.field_n ^ -1L) < (this.field_k ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = (this.field_k < this.field_n ? -1 : (this.field_k == this.field_n ? 0 : 1));
                stackIn_6_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_9_0 < 0) {
                    this.field_k = this.field_n;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_h = this.field_h + (this.field_k - this.field_n);
            this.field_n = this.field_n + (this.field_k + -this.field_n);
            this.field_k = this.field_k + param1;
            return 1;
          }
        } else {
          return 3;
        }
    }

    final static void a(boolean param0, int param1) {
        uf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        cc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (cc) ((Object) qb.field_a.d(9272));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    ia.a(param1, var4, -118);
                    var4 = (cc) ((Object) qb.field_a.e((byte) -119));
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
              var2 = qc.field_a.d(9272);
              L4: while (true) {
                if (var2 == null) {
                  break L0;
                } else {
                  da.a(0, param1);
                  var2 = qc.field_a.e((byte) -119);
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2_ref), "jd.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final long a(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Terraphoenix.field_V;
          var2 = System.nanoTime();
          var4 = -this.field_h + var2;
          this.field_h = var2;
          if (var4 <= -5000000000L) {
            break L0;
          } else {
            if (5000000000L > var4) {
              L1: {
                this.field_l[this.field_j] = var4;
                if (this.field_m < 1) {
                  this.field_m = this.field_m + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_j = (1 + this.field_j) % 10;
              break L0;
            } else {
              var6 = 0L;
              var8 = 1;
              L2: while (true) {
                if (this.field_m >= var8) {
                  var6 = var6 + this.field_l[(10 + (this.field_j - var8)) % 10];
                  var8++;
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    return var6 / (long)this.field_m;
                  }
                } else {
                  L3: {
                    if (param0 < -29) {
                      break L3;
                    } else {
                      jd.a(69, (fa) null, (fa) null);
                      break L3;
                    }
                  }
                  return var6 / (long)this.field_m;
                }
              }
            }
          }
        }
        var6 = 0L;
        var8 = 1;
        L4: while (true) {
          L5: {
            if (this.field_m < var8) {
              if (param0 < -29) {
                break L5;
              } else {
                jd.a(69, (fa) null, (fa) null);
                return var6 / (long)this.field_m;
              }
            } else {
              var6 = var6 + this.field_l[(10 + (this.field_j - var8)) % 10];
              var8++;
              if (var9 != 0) {
                break L5;
              } else {
                if (var9 == 0) {
                  continue L4;
                } else {
                  if (param0 < -29) {
                    return var6 / (long)this.field_m;
                  } else {
                    jd.a(69, (fa) null, (fa) null);
                    return var6 / (long)this.field_m;
                  }
                }
              }
            }
          }
          return var6 / (long)this.field_m;
        }
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1 < -21) {
          uf.field_f.b(param3, param0);
          if (param2) {
            L0: {
              var4 = 2 * (el.field_e % uf.field_f.field_r);
              if (var4 < uf.field_f.field_r) {
                break L0;
              } else {
                var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
                break L0;
              }
            }
            L1: {
              if ((var4 ^ -1) <= -11) {
                break L1;
              } else {
                var4 = 10;
                if (Terraphoenix.field_V == 0) {
                  lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
                  return;
                } else {
                  break L1;
                }
              }
            }
            if (var4 > -40 + uf.field_f.field_r) {
              var4 = -40 + uf.field_f.field_r;
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            } else {
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            }
          } else {
            return;
          }
        } else {
          jd.a(false, -74);
          uf.field_f.b(param3, param0);
          if (param2) {
            L2: {
              var4 = 2 * (el.field_e % uf.field_f.field_r);
              if (var4 < uf.field_f.field_r) {
                break L2;
              } else {
                var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
                break L2;
              }
            }
            L3: {
              if ((var4 ^ -1) <= -11) {
                break L3;
              } else {
                var4 = 10;
                if (Terraphoenix.field_V == 0) {
                  lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
                  return;
                } else {
                  break L3;
                }
              }
            }
            if (var4 > -40 + uf.field_f.field_r) {
              var4 = -40 + uf.field_f.field_r;
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            } else {
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0) {
        this.field_h = (long)param0;
        if ((this.field_k ^ -1L) >= (this.field_n ^ -1L)) {
          return;
        } else {
          this.field_n = this.field_n + (this.field_k + -this.field_n);
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            field_i = (String) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(dc param0, byte param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-4 >= (var2_int ^ -1)) {
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
                    L7: {
                      if (var2_int >= am.field_J) {
                        break L7;
                      } else {
                        stackOut_8_0 = ra.field_i[var2_int].field_l;
                        stackOut_8_1 = param0.field_l;
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var5 != 0) {
                          if (stackIn_11_0 <= stackIn_11_1) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          L8: {
                            if (stackIn_9_0 == stackIn_9_1) {
                              dupTemp$4 = ra.field_i[var2_int].a(2);
                              je.field_a[dupTemp$4] = je.field_a[dupTemp$4] + 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var2_int++;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (param1 <= -93) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                  field_i = (String) null;
                  break L5;
                }
                dupTemp$5 = param0.a(2);
                je.field_a[dupTemp$5] = je.field_a[dupTemp$5] + 1;
                var2_int = 0;
                var3 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var3 >= am.field_J) {
                        break L11;
                      } else {
                        stackOut_19_0 = param0.field_l ^ -1;
                        stackIn_27_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var5 != 0) {
                          break L10;
                        } else {
                          L12: {
                            L13: {
                              if (stackIn_20_0 != (ra.field_i[var3].field_l ^ -1)) {
                                break L13;
                              } else {
                                var4 = ra.field_i[var3].a(2);
                                if (bl.field_f < je.field_a[var4]) {
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
                            incrementValue$6 = var2_int;
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
                    stackOut_26_0 = var2_int;
                    stackIn_27_0 = stackOut_26_0;
                    break L10;
                  }
                  am.field_J = stackIn_27_0;
                  fieldTemp$7 = am.field_J;
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
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("jd.H(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L14;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L14;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    jd() {
        this.field_k = 0L;
        this.field_l = new long[10];
        this.field_j = 0;
        this.field_n = 0L;
        this.field_h = 0L;
        this.field_m = 1;
        this.field_n = System.nanoTime();
        this.field_k = System.nanoTime();
    }

    static {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
