/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends gm {
    private sm field_t;
    static String field_s;
    static int field_p;
    static int field_n;
    static byte[][] field_o;
    private sm[] field_q;
    static ri[] field_r;

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
          field_s = (String) null;
          field_o = (byte[][]) null;
          field_s = null;
          return;
        } else {
          field_o = (byte[][]) null;
          field_s = null;
          return;
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param2) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1) {
            var4 += 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (param3 != 63) {
          L2: {
            field_n = 124;
            if (param0) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return pl.field_r[var4];
        } else {
          L3: {
            if (param0) {
              var4++;
              break L3;
            } else {
              break L3;
            }
          }
          return pl.field_r[var4];
        }
    }

    fl(fl param0, boolean param1) {
        this();
        try {
            param0.a((fl) (this), param1, -26407);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        sm var7 = null;
        sm var9 = null;
        wb[] var10 = null;
        wp var11 = null;
        sm var12 = null;
        sm var13 = null;
        sm var14 = null;
        sm var15 = null;
        pk stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof wp)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pk) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (pk) (param0);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (wp) ((Object) stackIn_3_0);
              kw.a(param1 - -param0.field_v + param0.field_p, param1 - -param0.field_v, 1, param4 - -param0.field_r, param0.field_r + (param4 - -param0.field_q));
              if (var11 != null) {
                param3 = param3 & var11.field_x;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_q[0];
              this.field_t.a(true);
              var7.a(param4, param0, -28, (fl) (this), param1, this.field_t);
              if (var11 != null) {
                L4: {
                  if (!var11.field_C) {
                    break L4;
                  } else {
                    var12 = this.field_q[1];
                    if (var12 != null) {
                      var12.a(param4, param0, -75, (fl) (this), param1, this.field_t);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var11.field_k) {
                  break L3;
                } else {
                  L5: {
                    var13 = this.field_q[3];
                    if (-1 == (var11.field_l ^ -1)) {
                      break L5;
                    } else {
                      if (var13 == null) {
                        break L5;
                      } else {
                        var13.a(param4, param0, param2 ^ -5592346, (fl) (this), param1, this.field_t);
                        if (!Sumoblitz.field_L) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var9 = this.field_q[2];
                  if (var9 != null) {
                    var9.a(param4, param0, -97, (fl) (this), param1, this.field_t);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param2 == 5592405) {
                break L6;
              } else {
                var10 = (wb[]) null;
                this.a((wb[]) null, -110);
                break L6;
              }
            }
            L7: {
              if (param0.d(-1)) {
                var14 = this.field_q[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param4, param0, param2 ^ -5592417, (fl) (this), param1, this.field_t);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (!param3) {
                var15 = this.field_q[4];
                if (var15 != null) {
                  var15.a(param4, param0, -66, (fl) (this), param1, this.field_t);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            this.field_t.a(param1, (fl) (this), param4, -66, param0);
            su.a((byte) -70);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var6);
            stackOut_33_1 = new StringBuilder().append("fl.A(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(fl param0, boolean param1, int param2) {
        sm dupTemp$13 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        sm var5 = null;
        sm var6 = null;
        int var7 = 0;
        sm stackIn_12_0 = null;
        sm stackIn_13_0 = null;
        sm stackIn_14_0 = null;
        sm stackIn_14_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        sm stackOut_11_0 = null;
        sm stackOut_13_0 = null;
        sm stackOut_13_1 = null;
        sm stackOut_12_0 = null;
        sm stackOut_12_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, -123);
              if (param2 == -26407) {
                break L1;
              } else {
                field_p = -38;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1) {
                  break L3;
                } else {
                  la.a(this.field_q, 0, param0.field_q, 0, 6);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if ((var4_int ^ -1) <= -7) {
                  break L2;
                } else {
                  var5 = this.field_q[var4_int];
                  if (var7 == 0) {
                    L5: {
                      L6: {
                        if (var5 == null) {
                          break L6;
                        } else {
                          L7: {
                            var6 = param0.field_q[var4_int];
                            stackOut_11_0 = (sm) (var5);
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var6 == null) {
                              dupTemp$13 = new sm();
                              param0.field_q[var4_int] = dupTemp$13;
                              stackOut_13_0 = (sm) ((Object) stackIn_13_0);
                              stackOut_13_1 = (sm) (dupTemp$13);
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L7;
                            } else {
                              stackOut_12_0 = (sm) ((Object) stackIn_12_0);
                              stackOut_12_1 = (sm) (var6);
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              break L7;
                            }
                          }
                          ((sm) (Object) stackIn_14_0).a(stackIn_14_1, (byte) 94);
                          if (var7 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      param0.field_q[var4_int] = null;
                      break L5;
                    }
                    var4_int++;
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("fl.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public fl() {
        this.field_q = new sm[6];
        this.field_t = new sm();
        sm dupTemp$0 = new sm();
        this.field_q[0] = dupTemp$0;
        sm var1 = dupTemp$0;
        var1.a(true);
    }

    final void a(wb[] param0, int param1) {
        sm discarded$2 = null;
        sm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sm var5 = null;
        int var6 = 0;
        sm[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_q;
              var3 = var7;
              if (param1 == 28715) {
                break L1;
              } else {
                discarded$2 = this.a(false, 37);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                var5 = var7[var4];
                if (var6 == 0) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      var5.field_j = param0;
                      break L3;
                    }
                  }
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("fl.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, wb param1) {
        sm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        sm var6 = null;
        int var7 = 0;
        sm[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = this.field_q;
            var3 = var8;
            var4 = -50 % ((param0 - 68) / 36);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var8.length) {
                break L0;
              } else {
                var6 = var8[var5];
                if (var7 == 0) {
                  L2: {
                    if (var6 == null) {
                      break L2;
                    } else {
                      var6.field_i = param1;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("fl.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final sm a(boolean param0, int param1) {
        sm dupTemp$4 = null;
        sm dupTemp$5 = null;
        wb[] var4 = null;
        if (param0) {
          var4 = (wb[]) null;
          this.a((byte) -126, (wb[]) null, -97);
          dupTemp$4 = new sm();
          this.field_q[param1] = dupTemp$4;
          return dupTemp$4;
        } else {
          dupTemp$5 = new sm();
          this.field_q[param1] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final void a(byte param0, wb[] param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (!(null != this.field_q[var4_int])) {
                this.field_q[var4_int] = new sm();
            }
            this.field_q[param2].field_j = param1;
            var4_int = -9 % ((param0 - 57) / 52);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fl.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = "Waiting for extra data";
        field_n = 0;
        field_p = -1;
    }
}
